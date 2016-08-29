import java.util.ArrayList;

class RootModel {

	public String email;
	public int id;
	public String location_name;
	public String organizer_description;
	public String timezone;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String type;
	public String start_time;
	public String logo;
	public CopyrightModel _copyright;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String code_of_conduct;
	public String state;
	public String end_time;
	public String topic;
	public String organizer_name;
	public String name;

	public RootModel(String email, int id, String location_name, String organizer_description, String timezone, String background_image, ArrayList<Social_linksModel> social_links, VersionModel version, CreatorModel creator, String schedule_published_on, String type, String start_time, String logo, CopyrightModel copyright, String description, Call_for_papersModel call_for_papers, String privacy, String code_of_conduct, String state, String end_time, String topic, String organizer_name, String name) {

		this.email = email;
		this.id = id;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.background_image = background_image;
		this.social_links = social_links;
		this._version = version;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.start_time = start_time;
		this.logo = logo;
		this._copyright = copyright;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.end_time = end_time;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.name = name;

	}

}