import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String start_time;
	public String email;
	public String state;
	public String privacy;
	public String topic;
	public String end_time;
	public String code_of_conduct;
	public int id;
	public String background_image;
	public String logo;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String location_name;
	public String organizer_description;
	public String organizer_name;
	public String description;
	public VersionModel _version;
	public String timezone;
	public String type;

	public RootModel(ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String name, String start_time, String email, String state, String privacy, String topic, String end_time, String code_of_conduct, int id, String background_image, String logo, CopyrightModel copyright, String schedule_published_on, CreatorModel creator, String location_name, String organizer_description, String organizer_name, String description, VersionModel version, String timezone, String type) {

		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.start_time = start_time;
		this.email = email;
		this.state = state;
		this.privacy = privacy;
		this.topic = topic;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.background_image = background_image;
		this.logo = logo;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.description = description;
		this._version = version;
		this.timezone = timezone;
		this.type = type;

	}

}