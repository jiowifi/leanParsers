import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String location_name;
	public int id;
	public String description;
	public String email;
	public String topic;
	public String state;
	public String logo;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String timezone;
	public String organizer_description;
	public CreatorModel _creator;
	public String start_time;
	public String end_time;
	public String name;
	public String background_image;
	public String schedule_published_on;
	public String type;

	public RootModel(ArrayList<Social_linksModel> social_links, String privacy, CopyrightModel copyright, String organizer_name, String location_name, int id, String description, String email, String topic, String state, String logo, VersionModel version, Call_for_papersModel call_for_papers, String code_of_conduct, String timezone, String organizer_description, CreatorModel creator, String start_time, String end_time, String name, String background_image, String schedule_published_on, String type) {

		this.social_links = social_links;
		this.privacy = privacy;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.id = id;
		this.description = description;
		this.email = email;
		this.topic = topic;
		this.state = state;
		this.logo = logo;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.start_time = start_time;
		this.end_time = end_time;
		this.name = name;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.type = type;

	}

}