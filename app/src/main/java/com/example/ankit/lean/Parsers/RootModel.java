import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String state;
	public String location_name;
	public String organizer_description;
	public String start_time;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String privacy;
	public String name;
	public String topic;
	public String email;
	public String organizer_name;
	public String schedule_published_on;
	public String end_time;
	public String type;
	public int id;
	public String background_image;
	public CopyrightModel _copyright;
	public String code_of_conduct;

	public RootModel(String timezone, String state, String location_name, String organizer_description, String start_time, String logo, Call_for_papersModel call_for_papers, String description, CreatorModel creator, ArrayList<Social_linksModel> social_links, VersionModel version, String privacy, String name, String topic, String email, String organizer_name, String schedule_published_on, String end_time, String type, int id, String background_image, CopyrightModel copyright, String code_of_conduct) {

		this.timezone = timezone;
		this.state = state;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._creator = creator;
		this.social_links = social_links;
		this._version = version;
		this.privacy = privacy;
		this.name = name;
		this.topic = topic;
		this.email = email;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.type = type;
		this.id = id;
		this.background_image = background_image;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;

	}

}