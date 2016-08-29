import java.util.ArrayList;

class RootModel {

	public String logo;
	public String name;
	public String timezone;
	public String organizer_name;
	public VersionModel _version;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public CreatorModel _creator;
	public int id;
	public String code_of_conduct;
	public String background_image;
	public String end_time;
	public String organizer_description;
	public String location_name;
	public String schedule_published_on;
	public String privacy;
	public CopyrightModel _copyright;
	public String description;
	public String start_time;

	public RootModel(String logo, String name, String timezone, String organizer_name, VersionModel version, String topic, ArrayList<Social_linksModel> social_links, String state, String email, Call_for_papersModel call_for_papers, String type, CreatorModel creator, int id, String code_of_conduct, String background_image, String end_time, String organizer_description, String location_name, String schedule_published_on, String privacy, CopyrightModel copyright, String description, String start_time) {

		this.logo = logo;
		this.name = name;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._version = version;
		this.topic = topic;
		this.social_links = social_links;
		this.state = state;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this._creator = creator;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._copyright = copyright;
		this.description = description;
		this.start_time = start_time;

	}

}