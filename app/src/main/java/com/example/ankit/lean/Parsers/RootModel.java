import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String code_of_conduct;
	public int id;
	public String organizer_description;
	public String end_time;
	public String privacy;
	public String name;
	public String background_image;
	public String description;
	public VersionModel _version;
	public String type;
	public String state;
	public String email;
	public String schedule_published_on;
	public String start_time;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String location_name;
	public String timezone;
	public String topic;

	public RootModel(String organizer_name, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String logo, String code_of_conduct, int id, String organizer_description, String end_time, String privacy, String name, String background_image, String description, VersionModel version, String type, String state, String email, String schedule_published_on, String start_time, CreatorModel creator, CopyrightModel copyright, String location_name, String timezone, String topic) {

		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.privacy = privacy;
		this.name = name;
		this.background_image = background_image;
		this.description = description;
		this._version = version;
		this.type = type;
		this.state = state;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._creator = creator;
		this._copyright = copyright;
		this.location_name = location_name;
		this.timezone = timezone;
		this.topic = topic;

	}

}