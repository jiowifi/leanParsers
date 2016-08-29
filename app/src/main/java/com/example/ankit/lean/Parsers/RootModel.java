import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String email;
	public String description;
	public String logo;
	public String privacy;
	public String organizer_name;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String timezone;
	public int id;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String type;
	public String end_time;
	public String topic;
	public String state;
	public String location_name;

	public RootModel(String background_image, String email, String description, String logo, String privacy, String organizer_name, String code_of_conduct, CreatorModel creator, String schedule_published_on, CopyrightModel copyright, String start_time, Call_for_papersModel call_for_papers, String organizer_description, String timezone, int id, VersionModel version, ArrayList<Social_linksModel> social_links, String name, String type, String end_time, String topic, String state, String location_name) {

		this.background_image = background_image;
		this.email = email;
		this.description = description;
		this.logo = logo;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.id = id;
		this._version = version;
		this.social_links = social_links;
		this.name = name;
		this.type = type;
		this.end_time = end_time;
		this.topic = topic;
		this.state = state;
		this.location_name = location_name;

	}

}