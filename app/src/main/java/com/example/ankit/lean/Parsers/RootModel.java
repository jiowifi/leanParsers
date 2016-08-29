import java.util.ArrayList;

class RootModel {

	public String type;
	public String background_image;
	public String logo;
	public String start_time;
	public CreatorModel _creator;
	public String organizer_name;
	public String timezone;
	public String name;
	public int id;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String end_time;
	public String location_name;
	public String code_of_conduct;
	public String email;
	public String description;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String state;

	public RootModel(String type, String background_image, String logo, String start_time, CreatorModel creator, String organizer_name, String timezone, String name, int id, VersionModel version, CopyrightModel copyright, String end_time, String location_name, String code_of_conduct, String email, String description, String privacy, ArrayList<Social_linksModel> social_links, String schedule_published_on, String topic, Call_for_papersModel call_for_papers, String organizer_description, String state) {

		this.type = type;
		this.background_image = background_image;
		this.logo = logo;
		this.start_time = start_time;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.name = name;
		this.id = id;
		this._version = version;
		this._copyright = copyright;
		this.end_time = end_time;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.description = description;
		this.privacy = privacy;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.state = state;

	}

}