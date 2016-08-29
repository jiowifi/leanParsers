import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String schedule_published_on;
	public String topic;
	public String state;
	public String description;
	public String background_image;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public VersionModel _version;
	public int id;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String timezone;
	public CreatorModel _creator;
	public String type;
	public String logo;
	public String name;
	public String end_time;
	public String location_name;

	public RootModel(String code_of_conduct, String organizer_description, Call_for_papersModel call_for_papers, String email, String schedule_published_on, String topic, String state, String description, String background_image, String privacy, ArrayList<Social_linksModel> social_links, String start_time, VersionModel version, int id, CopyrightModel copyright, String organizer_name, String timezone, CreatorModel creator, String type, String logo, String name, String end_time, String location_name) {

		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.state = state;
		this.description = description;
		this.background_image = background_image;
		this.privacy = privacy;
		this.social_links = social_links;
		this.start_time = start_time;
		this._version = version;
		this.id = id;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this._creator = creator;
		this.type = type;
		this.logo = logo;
		this.name = name;
		this.end_time = end_time;
		this.location_name = location_name;

	}

}