import java.util.ArrayList;

class RootModel {

	public String description;
	public String type;
	public String email;
	public int id;
	public CopyrightModel _copyright;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String schedule_published_on;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String timezone;
	public String organizer_name;
	public String background_image;
	public String name;
	public String start_time;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String location_name;
	public String organizer_description;
	public String logo;
	public String topic;

	public RootModel(String description, String type, String email, int id, CopyrightModel copyright, String state, Call_for_papersModel call_for_papers, String privacy, String schedule_published_on, String end_time, ArrayList<Social_linksModel> social_links, VersionModel version, String timezone, String organizer_name, String background_image, String name, String start_time, String code_of_conduct, CreatorModel creator, String location_name, String organizer_description, String logo, String topic) {

		this.description = description;
		this.type = type;
		this.email = email;
		this.id = id;
		this._copyright = copyright;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.social_links = social_links;
		this._version = version;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.name = name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.topic = topic;

	}

}