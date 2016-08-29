import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public int id;
	public String logo;
	public String email;
	public String code_of_conduct;
	public String state;
	public String privacy;
	public String location_name;
	public String type;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String topic;
	public String organizer_name;
	public String background_image;
	public String start_time;
	public String schedule_published_on;
	public VersionModel _version;
	public String end_time;
	public CreatorModel _creator;

	public RootModel(ArrayList<Social_linksModel> social_links, String timezone, String description, Call_for_papersModel call_for_papers, String name, int id, String logo, String email, String code_of_conduct, String state, String privacy, String location_name, String type, String organizer_description, CopyrightModel copyright, String topic, String organizer_name, String background_image, String start_time, String schedule_published_on, VersionModel version, String end_time, CreatorModel creator) {

		this.social_links = social_links;
		this.timezone = timezone;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.id = id;
		this.logo = logo;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.privacy = privacy;
		this.location_name = location_name;
		this.type = type;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.end_time = end_time;
		this._creator = creator;

	}

}