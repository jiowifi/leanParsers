import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String background_image;
	public String end_time;
	public String timezone;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String name;
	public String type;
	public String organizer_description;
	public String location_name;
	public String description;
	public String schedule_published_on;
	public String logo;
	public String start_time;
	public int id;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String code_of_conduct;
	public String email;
	public String state;
	public String topic;

	public RootModel(Call_for_papersModel call_for_papers, VersionModel version, String background_image, String end_time, String timezone, CreatorModel creator, CopyrightModel copyright, String name, String type, String organizer_description, String location_name, String description, String schedule_published_on, String logo, String start_time, int id, String organizer_name, ArrayList<Social_linksModel> social_links, String privacy, String code_of_conduct, String email, String state, String topic) {

		this._call_for_papers = call_for_papers;
		this._version = version;
		this.background_image = background_image;
		this.end_time = end_time;
		this.timezone = timezone;
		this._creator = creator;
		this._copyright = copyright;
		this.name = name;
		this.type = type;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.start_time = start_time;
		this.id = id;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.state = state;
		this.topic = topic;

	}

}