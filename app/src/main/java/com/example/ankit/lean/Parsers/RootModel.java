import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public CopyrightModel _copyright;
	public String type;
	public int id;
	public String start_time;
	public String end_time;
	public String organizer_description;
	public CreatorModel _creator;
	public String logo;
	public String topic;
	public String state;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String privacy;
	public String name;
	public String description;
	public String timezone;
	public String email;
	public String location_name;
	public String background_image;
	public String code_of_conduct;

	public RootModel(String organizer_name, CopyrightModel copyright, String type, int id, String start_time, String end_time, String organizer_description, CreatorModel creator, String logo, String topic, String state, VersionModel version, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String schedule_published_on, String privacy, String name, String description, String timezone, String email, String location_name, String background_image, String code_of_conduct) {

		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.type = type;
		this.id = id;
		this.start_time = start_time;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.logo = logo;
		this.topic = topic;
		this.state = state;
		this._version = version;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.name = name;
		this.description = description;
		this.timezone = timezone;
		this.email = email;
		this.location_name = location_name;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;

	}

}