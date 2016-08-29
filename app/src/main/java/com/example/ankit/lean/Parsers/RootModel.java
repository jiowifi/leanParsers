import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String name;
	public String start_time;
	public CopyrightModel _copyright;
	public String type;
	public CreatorModel _creator;
	public String end_time;
	public String organizer_description;
	public String topic;
	public VersionModel _version;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String description;
	public String timezone;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String location_name;
	public String code_of_conduct;
	public int id;
	public String schedule_published_on;
	public String state;

	public RootModel(String background_image, String name, String start_time, CopyrightModel copyright, String type, CreatorModel creator, String end_time, String organizer_description, String topic, VersionModel version, String email, Call_for_papersModel call_for_papers, String organizer_name, String description, String timezone, String logo, ArrayList<Social_linksModel> social_links, String privacy, String location_name, String code_of_conduct, int id, String schedule_published_on, String state) {

		this.background_image = background_image;
		this.name = name;
		this.start_time = start_time;
		this._copyright = copyright;
		this.type = type;
		this._creator = creator;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this._version = version;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.description = description;
		this.timezone = timezone;
		this.logo = logo;
		this.social_links = social_links;
		this.privacy = privacy;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.state = state;

	}

}