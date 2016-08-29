import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String topic;
	public String state;
	public String location_name;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public CreatorModel _creator;
	public String end_time;
	public String start_time;
	public String name;
	public String email;
	public String privacy;
	public String code_of_conduct;
	public String timezone;
	public String background_image;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public VersionModel _version;
	public String organizer_description;
	public String type;

	public RootModel(String organizer_name, ArrayList<Social_linksModel> social_links, int id, String topic, String state, String location_name, String logo, Call_for_papersModel call_for_papers, String description, CreatorModel creator, String end_time, String start_time, String name, String email, String privacy, String code_of_conduct, String timezone, String background_image, CopyrightModel copyright, String schedule_published_on, VersionModel version, String organizer_description, String type) {

		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.id = id;
		this.topic = topic;
		this.state = state;
		this.location_name = location_name;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._creator = creator;
		this.end_time = end_time;
		this.start_time = start_time;
		this.name = name;
		this.email = email;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.background_image = background_image;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.organizer_description = organizer_description;
		this.type = type;

	}

}