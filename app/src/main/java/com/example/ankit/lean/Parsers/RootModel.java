import java.util.ArrayList;

class RootModel {

	public String name;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String type;
	public String location_name;
	public String logo;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String description;
	public VersionModel _version;
	public String code_of_conduct;
	public String start_time;
	public CreatorModel _creator;
	public String end_time;
	public String topic;
	public String privacy;
	public String organizer_description;
	public String timezone;
	public String organizer_name;
	public int id;
	public String background_image;
	public String state;

	public RootModel(String name, Call_for_papersModel call_for_papers, String email, String type, String location_name, String logo, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String schedule_published_on, String description, VersionModel version, String code_of_conduct, String start_time, CreatorModel creator, String end_time, String topic, String privacy, String organizer_description, String timezone, String organizer_name, int id, String background_image, String state) {

		this.name = name;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.type = type;
		this.location_name = location_name;
		this.logo = logo;
		this._copyright = copyright;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._creator = creator;
		this.end_time = end_time;
		this.topic = topic;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.id = id;
		this.background_image = background_image;
		this.state = state;

	}

}